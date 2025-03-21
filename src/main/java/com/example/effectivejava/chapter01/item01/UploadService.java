package com.example.effectivejava.chapter01.item01;

public interface UploadService {

    /* 장점3,4 */
    static UploadService of(String type) {
        if (type.equals("BULK")) {
            return new BulkUploadService();
        } else {
            return new ChunkUploadService();
        }

    }

}
