package org.jacoco.core.runtime;

import java.io.IOException;
import java.io.InputStream;
import org.jacoco.core.data.ExecutionDataReader;

/* JADX INFO: loaded from: classes6.dex */
public class RemoteControlReader extends ExecutionDataReader {
    private IRemoteCommandVisitor remoteCommandVisitor;

    public RemoteControlReader(InputStream inputStream) throws IOException {
        super(inputStream);
    }

    private void readDumpCommand() throws IOException {
        if (this.remoteCommandVisitor == null) {
            throw new IOException("No remote command visitor.");
        }
        this.remoteCommandVisitor.visitDumpCommand(this.f226135in.readBoolean(), this.f226135in.readBoolean());
    }

    @Override // org.jacoco.core.data.ExecutionDataReader
    public boolean readBlock(byte b10) throws IOException {
        if (b10 == 32) {
            return false;
        }
        if (b10 != 64) {
            return super.readBlock(b10);
        }
        readDumpCommand();
        return true;
    }

    public void setRemoteCommandVisitor(IRemoteCommandVisitor iRemoteCommandVisitor) {
        this.remoteCommandVisitor = iRemoteCommandVisitor;
    }
}
