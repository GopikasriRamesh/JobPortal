package com.sri.JobPortal.repo;

import com.sri.JobPortal.modal.Post;

import java.util.List;

public interface SearchRepository {

   List<Post> findByText(String text);
}
