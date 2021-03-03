package com.library.management.database;

import com.library.management.model.Request;
import com.library.management.model.User;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class DatabaseAccessResource {

  /**
   * Get user by id.
   * @param userId user id.
   * @return user data.
   */
  public User getUserById(int userId) {
    DaoManager daoManager = new DaoManager();
    try(Statement stmt = daoManager.databaseConnector().createStatement();
    ){
    ResultSet rs = stmt.executeQuery( "" );
    while ( rs.next() ) {
      //todo : create your userDataset
    }
      rs.close();
      daoManager.databaseConnector().close();
    }catch (Exception exception){
      throw new RuntimeException("Failed to get user information for id : "+userId,exception);
    }
    return null;
  }

  /**
   * Get list of requests made by user.
   * @param userId user id.
   * @return list of user requests.
   */
  public List<Request> getRequestListByUserId(int userId){
    return null;
  }

  /**
   * Add new user request.
   * @param request new user request.
   * @return status for the query.
   */
  public boolean addRequest(Request request){
    return true;
  }

  /**
   * update an existing request.
   * @param request user request.
   * @return status for the query.
   */
  public boolean updateRequest(Request request){
    return true;
  }

  /**
   * Query for the last sequence number
   * @return max referenceIdNumber
   */
  public String getLastRequestSequenceNumber(){
    return null;
  }

  /**
   * Delete the user request in draft state.
   * @param draftId draft id.
   * @return query status.
   */
  public boolean deleteRequest(int draftId){
    return true;
  }
}
