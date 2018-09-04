package com.kms.service;

import java.util.List;

import com.kms.model.Staff;

public interface StaffService {
  List<Staff> getone(String workid);
  List<Staff> getall();
}
