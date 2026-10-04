package org.jacoco.core.tools;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.InetAddress;
import java.net.Socket;
import org.jacoco.core.runtime.RemoteControlReader;
import org.jacoco.core.runtime.RemoteControlWriter;

/* JADX INFO: loaded from: classes6.dex */
public class ExecDumpClient {
    private boolean dump = true;
    private boolean reset = false;
    private int retryCount = 0;
    private long retryDelay;

    public ExecDumpClient() {
        setRetryDelay(1000L);
    }

    private void sleep() throws InterruptedIOException {
        try {
            Thread.sleep(this.retryDelay);
        } catch (InterruptedException unused) {
            throw new InterruptedIOException();
        }
    }

    private Socket tryConnect(InetAddress inetAddress, int i10) throws IOException {
        int i11 = 0;
        while (true) {
            try {
                onConnecting(inetAddress, i10);
                return new Socket(inetAddress, i10);
            } catch (IOException e10) {
                i11++;
                if (i11 > this.retryCount) {
                    throw e10;
                }
                onConnectionFailure(e10);
                sleep();
            }
        }
    }

    public ExecFileLoader dump(String str, int i10) throws IOException {
        return dump(InetAddress.getByName(str), i10);
    }

    public void onConnecting(InetAddress inetAddress, int i10) {
    }

    public void onConnectionFailure(IOException iOException) {
    }

    public void setDump(boolean z10) {
        this.dump = z10;
    }

    public void setReset(boolean z10) {
        this.reset = z10;
    }

    public void setRetryCount(int i10) {
        this.retryCount = i10;
    }

    public void setRetryDelay(long j10) {
        this.retryDelay = j10;
    }

    public ExecFileLoader dump(InetAddress inetAddress, int i10) throws IOException {
        ExecFileLoader execFileLoader = new ExecFileLoader();
        Socket socketTryConnect = tryConnect(inetAddress, i10);
        try {
            RemoteControlWriter remoteControlWriter = new RemoteControlWriter(socketTryConnect.getOutputStream());
            RemoteControlReader remoteControlReader = new RemoteControlReader(socketTryConnect.getInputStream());
            remoteControlReader.setSessionInfoVisitor(execFileLoader.getSessionInfoStore());
            remoteControlReader.setExecutionDataVisitor(execFileLoader.getExecutionDataStore());
            remoteControlWriter.visitDumpCommand(this.dump, this.reset);
            if (remoteControlReader.read()) {
                return execFileLoader;
            }
            throw new IOException("Socket closed unexpectedly.");
        } finally {
            socketTryConnect.close();
        }
    }
}
