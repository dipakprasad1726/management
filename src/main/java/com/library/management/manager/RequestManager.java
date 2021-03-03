package com.library.management.manager;

import com.library.management.model.NewBookRequest;
import com.library.management.model.UserRequestList;
import org.springframework.stereotype.Component;

@Component
public interface RequestManager {
  String addNewBookRequest(NewBookRequest newBookRequest);

  String deleteBookRequest(int draftId);

  UserRequestList getRequestByUserId(int userId);

  boolean validateUser(int userId);
}
