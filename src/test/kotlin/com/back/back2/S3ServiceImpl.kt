package com.back.back2

import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service

class S3ServiceImpl : S3Service {
    override fun getBucketNames(): List<String> {
        return listOf("")
    }
}