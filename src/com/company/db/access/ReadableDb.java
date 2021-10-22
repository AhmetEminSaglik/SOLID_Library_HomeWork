package com.company.db.access;

import java.util.List;

public interface ReadableDb<T> {
    List<T> getList();

}
