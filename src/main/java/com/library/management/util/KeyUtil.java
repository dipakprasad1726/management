package com.library.management.util;

import com.library.management.database.DatabaseAccessResource;

public class KeyUtil {

  private final DatabaseAccessResource databaseAccessResource = new DatabaseAccessResource();

  /**
   * Generates the next sequence number for reference id.
   * @return new sequence number.
   */
  public String generateReferenceId(){
    String lastSequenceNumber = databaseAccessResource.getLastRequestSequenceNumber();
    //ToDo : write the logic to generate the next sequence number.
    return null;
  }
}
