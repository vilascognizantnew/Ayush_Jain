package com.cts.books.errorhandler;

import java.util.Set;

public class BookUnSupportedFieldPatchException  extends RuntimeException {

    public BookUnSupportedFieldPatchException(Set<String> keys) {
        super("Field " + keys.toString() + " update is not allow.");
    }

}
