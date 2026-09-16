package com.eduhi.email_manager.dto;

import java.util.UUID;

public record EmailRecordDto(UUID userID,
                             String emailTo,
                             String subject,
                             String text) {

}
