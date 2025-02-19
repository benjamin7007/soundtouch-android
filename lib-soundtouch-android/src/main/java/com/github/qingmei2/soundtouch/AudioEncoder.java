package com.github.qingmei2.soundtouch;

import java.io.IOException;

public interface AudioEncoder {
    int writeChunk(byte[] input, int offSetInBytes, int sizeInBytes) throws IOException;

    void close();

    void finishWriting() throws IOException;

    void initFileOutput(String fileNameOut) throws IOException;
}
