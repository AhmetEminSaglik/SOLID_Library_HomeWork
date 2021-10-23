package com.company.db.access.read;

import java.util.List;

public interface ReadableDb<T> {
    List<T> getList();

}
