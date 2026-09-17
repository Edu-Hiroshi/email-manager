package com.eduhi.email_manager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduhi.email_manager.models.EmailModel;
import java.util.UUID;

public interface EmailRepository extends JpaRepository<EmailModel, UUID> {

}
