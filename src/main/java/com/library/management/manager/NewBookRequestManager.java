package com.library.management.manager;

import com.library.management.database.DatabaseAccessResource;
import com.library.management.exception.ControlledExceptions;
import com.library.management.model.Book;
import com.library.management.model.NewBookRequest;
import com.library.management.model.Request;
import com.library.management.model.UserRequestList;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class NewBookRequestManager implements RequestManager{

  @Override
  public String addNewBookRequest(NewBookRequest newBookRequest){
    if(newBookRequest.getFormStatus().equals("SUBMIT")){
      //todo: check if the record is already in draft, if YES then update else add new record.
    }else if(newBookRequest.getFormStatus().equals("DRAFT")){
      //todo : save for draft
    }else throw new ControlledExceptions.InvalidRequestException();
    //todo : write the logic for adding the list of request
    System.out.println(newBookRequest.toString());
    return "Done";
  }

  @Override
  public String deleteBookRequest(int draftId){
    DatabaseAccessResource databaseAccessResource = new DatabaseAccessResource();
    if(databaseAccessResource.deleteRequest(draftId)) return "draft deleted successfully";
    return "failed to delete draft.";
  }

  @Override
  public UserRequestList getRequestByUserId(int userId) {
    Request request = new Book();
    List<Request> req = new ArrayList<>();
    req.add(request);
    UserRequestList userRequestList = UserRequestList.builder().requestList(req).build();
    return userRequestList;
  }

  @Override
  public boolean validateUser(int userId){

    return true;
  }

}
