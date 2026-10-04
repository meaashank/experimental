package org.apache.commons.io.output;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes6.dex */
public class ProxyWriter extends FilterWriter {
    public ProxyWriter(Writer writer) {
        super(writer);
    }

    public void afterWrite(int i10) throws IOException {
    }

    public void beforeWrite(int i10) throws IOException {
    }

    @Override // java.io.FilterWriter, java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            ((FilterWriter) this).out.close();
        } catch (IOException e10) {
            handleIOException(e10);
        }
    }

    @Override // java.io.FilterWriter, java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        try {
            ((FilterWriter) this).out.flush();
        } catch (IOException e10) {
            handleIOException(e10);
        }
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(int i10) throws IOException {
        try {
            beforeWrite(1);
            ((FilterWriter) this).out.write(i10);
            afterWrite(1);
        } catch (IOException e10) {
            handleIOException(e10);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c10) throws IOException {
        try {
            beforeWrite(1);
            ((FilterWriter) this).out.append(c10);
            afterWrite(1);
            return this;
        } catch (IOException e10) {
            handleIOException(e10);
            return this;
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr) throws IOException {
        int length;
        if (cArr != null) {
            try {
                length = cArr.length;
            } catch (IOException e10) {
                handleIOException(e10);
                return;
            }
        } else {
            length = 0;
        }
        beforeWrite(length);
        ((FilterWriter) this).out.write(cArr);
        afterWrite(length);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i10, int i11) throws IOException {
        int i12 = i11 - i10;
        try {
            beforeWrite(i12);
            ((FilterWriter) this).out.append(charSequence, i10, i11);
            afterWrite(i12);
            return this;
        } catch (IOException e10) {
            handleIOException(e10);
            return this;
        }
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(char[] cArr, int i10, int i11) throws IOException {
        try {
            beforeWrite(i11);
            ((FilterWriter) this).out.write(cArr, i10, i11);
            afterWrite(i11);
        } catch (IOException e10) {
            handleIOException(e10);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) throws IOException {
        int length;
        if (charSequence != null) {
            try {
                length = charSequence.length();
            } catch (IOException e10) {
                handleIOException(e10);
                return this;
            }
        } else {
            length = 0;
        }
        beforeWrite(length);
        ((FilterWriter) this).out.append(charSequence);
        afterWrite(length);
        return this;
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        int length;
        if (str != null) {
            try {
                length = str.length();
            } catch (IOException e10) {
                handleIOException(e10);
                return;
            }
        } else {
            length = 0;
        }
        beforeWrite(length);
        ((FilterWriter) this).out.write(str);
        afterWrite(length);
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(String str, int i10, int i11) throws IOException {
        try {
            beforeWrite(i11);
            ((FilterWriter) this).out.write(str, i10, i11);
            afterWrite(i11);
        } catch (IOException e10) {
            handleIOException(e10);
        }
    }

    public void handleIOException(IOException iOException) throws IOException {
        throw iOException;
    }
}
