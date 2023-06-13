package org.example.service;

import java.io.File;
import java.util.List;

public interface IFileService {
    File readFolder(String FolderPath);
    List<String> readFile();
    void writeFile(List<String> rows);

}
