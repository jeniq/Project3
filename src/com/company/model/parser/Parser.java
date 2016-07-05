package com.company.model.parser;

import java.util.List;

/**
 * This interface set default method for every parser
 * that need to be implemented.
 *
 * @version 05 Jule 2016
 * @author Yevhen Hryshchenko
 */
public interface Parser {
    List parse(String path);
}
