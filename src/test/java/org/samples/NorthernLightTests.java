package org.samples;

import org.approvaltests.Approvals;
import org.approvaltests.JsonApprovals;
import org.junit.jupiter.api.Test;

public class NorthernLightTests {
    @Test
    public void canFetchNoaaAuroraAlerts() throws Exception {
        String city = "Fairbanks";
        double latitude = 64.8378;
        double longitude = -147.7164;
        String result = NoaaAuroraService.getAuroraAlert(city, latitude, longitude);
        JsonApprovals.verifyJson(result);
    }
}
