package de.festival.seed.wfswarm.rest.status;

import java.time.LocalDateTime;

class ServiceStatusDTO {
    private LocalDateTime timestamp = LocalDateTime.now();

    private String generalStatus;

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getGeneralStatus() {
        return generalStatus;
    }

    public void setGeneralStatus(String generalStatus) {
        this.generalStatus = generalStatus;
    }

}
