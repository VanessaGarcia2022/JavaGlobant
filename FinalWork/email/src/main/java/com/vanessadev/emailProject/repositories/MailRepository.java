package com.vanessadev.emailProject.repositories;

import com.vanessadev.emailProject.model.Mail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MailRepository extends JpaRepository<Mail, Long> {
}