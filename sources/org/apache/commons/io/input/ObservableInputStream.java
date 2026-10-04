package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ObservableInputStream extends ProxyInputStream {
    private final List<Observer> observers;

    public static abstract class Observer {
        public void closed() throws IOException {
        }

        public void data(int i10) throws IOException {
        }

        public void finished() throws IOException {
        }

        public void data(byte[] bArr, int i10, int i11) throws IOException {
        }

        public void error(IOException iOException) throws IOException {
            throw iOException;
        }
    }

    public ObservableInputStream(InputStream inputStream) {
        super(inputStream);
        this.observers = new ArrayList();
    }

    public void add(Observer observer) {
        this.observers.add(observer);
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            super.close();
            e = null;
        } catch (IOException e10) {
            e = e10;
        }
        if (e == null) {
            noteClosed();
        } else {
            noteError(e);
        }
    }

    public void consume() throws IOException {
        while (read(new byte[8192]) != -1) {
        }
    }

    public List<Observer> getObservers() {
        return this.observers;
    }

    public void noteClosed() throws IOException {
        Iterator<Observer> it = getObservers().iterator();
        while (it.hasNext()) {
            it.next().closed();
        }
    }

    public void noteDataByte(int i10) throws IOException {
        Iterator<Observer> it = getObservers().iterator();
        while (it.hasNext()) {
            it.next().data(i10);
        }
    }

    public void noteDataBytes(byte[] bArr, int i10, int i11) throws IOException {
        Iterator<Observer> it = getObservers().iterator();
        while (it.hasNext()) {
            it.next().data(bArr, i10, i11);
        }
    }

    public void noteError(IOException iOException) throws IOException {
        Iterator<Observer> it = getObservers().iterator();
        while (it.hasNext()) {
            it.next().error(iOException);
        }
    }

    public void noteFinished() throws IOException {
        Iterator<Observer> it = getObservers().iterator();
        while (it.hasNext()) {
            it.next().finished();
        }
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i10;
        try {
            i10 = super.read();
            e = null;
        } catch (IOException e10) {
            e = e10;
            i10 = 0;
        }
        if (e != null) {
            noteError(e);
        } else if (i10 == -1) {
            noteFinished();
        } else {
            noteDataByte(i10);
        }
        return i10;
    }

    public void remove(Observer observer) {
        this.observers.remove(observer);
    }

    public void removeAllObservers() {
        this.observers.clear();
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        int i10;
        try {
            i10 = super.read(bArr);
            e = null;
        } catch (IOException e10) {
            e = e10;
            i10 = 0;
        }
        if (e != null) {
            noteError(e);
        } else if (i10 == -1) {
            noteFinished();
        } else if (i10 > 0) {
            noteDataBytes(bArr, 0, i10);
        }
        return i10;
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        try {
            i12 = super.read(bArr, i10, i11);
            e = null;
        } catch (IOException e10) {
            e = e10;
            i12 = 0;
        }
        if (e != null) {
            noteError(e);
        } else if (i12 == -1) {
            noteFinished();
        } else if (i12 > 0) {
            noteDataBytes(bArr, i10, i12);
        }
        return i12;
    }
}
