package com.example.bebuildingmanagement.service.implement;

import com.example.bebuildingmanagement.repository.IAccountRepository;
import com.example.bebuildingmanagement.service.interfaces.IAccountService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class AccountServiceImpl implements IAccountService {
    IAccountRepository iAccountRepository;

}
