import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;


interface ExternalApi {
    String getData();
}


class MyService {

    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }
}


public class VerifyInteractionTest {


    @Test
    public void testVerifyInteraction() {

        // Create Mock Object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Create Service
        MyService service = new MyService(mockApi);

        // Call Method
        service.fetchData();

        // Verify API method was called
        verify(mockApi).getData();

        System.out.println("Interaction Verification Successful");
    }
}