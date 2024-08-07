package com.webmall.s3;

public interface S3Service {
   void putObject(String bucketName, String key, byte[] file);

   byte[] getObjectBytes(String bucketName, String key);
   
   void deleteObject(String bucketName, String key);
}
