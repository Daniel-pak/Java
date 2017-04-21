package com.company;

import java.util.List;

/**
 * Created by danielpak on 4/20/17.
 */
public interface ISaveable {
    List<String> write();
    void read(List<String> savedValues);
}
