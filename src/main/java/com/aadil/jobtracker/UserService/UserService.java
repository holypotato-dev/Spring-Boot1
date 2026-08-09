package com.aadil.jobtracker.UserService;

import com.aadil.jobtracker.UserRepository.SortDirection;
import com.aadil.jobtracker.UserRepository.UserSortField;
import com.aadil.jobtracker.Validation.UserRequestDTO;
import com.aadil.jobtracker.Validation.UserResponseDTO;
import com.aadil.jobtracker.responses.PagedResponse;

import java.util.List;
import java.util.Optional;

public interface UserService {

    UserResponseDTO createUser (UserRequestDTO dto);

    List<UserResponseDTO> createUsers (List<UserRequestDTO> dtos);

    UserResponseDTO getUser (Long id);

    List<UserResponseDTO> getUsersById (List<Long>ids);

    PagedResponse<UserResponseDTO> getAllUsers (String search,  int size,int pageNumber, UserSortField userSortField, SortDirection sortDirection);

    Optional<UserResponseDTO> updateUser (Long id, UserRequestDTO dto);

    void deleteUser (Long id,boolean confirm);

    void deleteAll(boolean confirm);

    void deleteById (List<Long>ids,boolean confirm);
}