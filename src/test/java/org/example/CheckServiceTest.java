package org.example;

import com.programika.rro.ws.chk.Check;
import com.programika.rro.ws.chk.CheckResponse;
import com.programika.rro.ws.chk.ChkIncomeServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.junit.jupiter.api.Test;


public class CheckServiceTest {

    @Test
    void testMethod() {
        ManagedChannel channel = ManagedChannelBuilder
            .forAddress("cabinet.tax.gov.ua", 9443)
            .useTransportSecurity()
            .build();

        ChkIncomeServiceGrpc.ChkIncomeServiceBlockingStub stub = ChkIncomeServiceGrpc.newBlockingStub(channel);

        Check check = Check.newBuilder()
            .setCheckType(Check.Type.CHK)
            .setRroFn("4000201260")
            .setDateTime(System.currentTimeMillis())
//            .setCheckSign()
            .build();

        CheckResponse response = stub.ping(check);

        System.out.println("Відповідь від сервера: " + response.getErrorMessage());

        channel.shutdown();
    }
}
