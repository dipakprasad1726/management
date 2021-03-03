package com.library.management.resource;

import com.library.management.exception.ControlledExceptions;
import com.library.management.manager.NewBookRequestManager;
import com.library.management.manager.RequestManager;
import com.library.management.model.NewBookRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("library")
public class LibraryResource {

  private final RequestManager requestManager;

  public LibraryResource(NewBookRequestManager newBookRequestManager){
    requestManager = newBookRequestManager;
  }

  @RequestMapping(value = "/newRequest", method = RequestMethod.PUT)
  public ResponseEntity<Object> updateProduct(NewBookRequest newBookRequest) {
    if(!newBookRequest.getRequestType().equals("Book"))throw new ControlledExceptions.InvalidRequestException();
    return new ResponseEntity<>(requestManager.addNewBookRequest(newBookRequest), HttpStatus.OK);
  }

  @RequestMapping(value = "/getRequests/{userId}", method = RequestMethod.GET)
  public ResponseEntity<Object> getRequestList(@PathVariable("userId") int userId) {
    if(!requestManager.validateUser(userId))throw new ControlledExceptions.InvalidUserException();
    return new ResponseEntity<>(requestManager.getRequestByUserId(userId), HttpStatus.OK);
  }
}
