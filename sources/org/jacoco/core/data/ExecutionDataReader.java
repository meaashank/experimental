package org.jacoco.core.data;

import java.io.IOException;
import java.io.InputStream;
import org.jacoco.core.internal.data.CompactDataInput;

/* JADX INFO: loaded from: classes6.dex */
public class ExecutionDataReader {

    /* JADX INFO: renamed from: in, reason: collision with root package name */
    protected final CompactDataInput f226135in;
    private ISessionInfoVisitor sessionInfoVisitor = null;
    private IExecutionDataVisitor executionDataVisitor = null;
    private boolean firstBlock = true;

    public ExecutionDataReader(InputStream inputStream) {
        this.f226135in = new CompactDataInput(inputStream);
    }

    private void readExecutionData() throws IOException {
        if (this.executionDataVisitor == null) {
            throw new IOException("No execution data visitor.");
        }
        this.executionDataVisitor.visitClassExecution(new ExecutionData(this.f226135in.readLong(), this.f226135in.readUTF(), this.f226135in.readBooleanArray()));
    }

    private void readHeader() throws IOException {
        if (this.f226135in.readChar() != 49344) {
            throw new IOException("Invalid execution data file.");
        }
        char c10 = this.f226135in.readChar();
        if (c10 != ExecutionDataWriter.FORMAT_VERSION) {
            throw new IncompatibleExecDataVersionException(c10);
        }
    }

    private void readSessionInfo() throws IOException {
        if (this.sessionInfoVisitor == null) {
            throw new IOException("No session info visitor.");
        }
        this.sessionInfoVisitor.visitSessionInfo(new SessionInfo(this.f226135in.readUTF(), this.f226135in.readLong(), this.f226135in.readLong()));
    }

    public boolean read() throws IOException {
        byte b10;
        do {
            int i10 = this.f226135in.read();
            if (i10 == -1) {
                return false;
            }
            b10 = (byte) i10;
            if (this.firstBlock && b10 != 1) {
                throw new IOException("Invalid execution data file.");
            }
            this.firstBlock = false;
        } while (readBlock(b10));
        return true;
    }

    public boolean readBlock(byte b10) throws IOException {
        if (b10 == 1) {
            readHeader();
            return true;
        }
        if (b10 == 16) {
            readSessionInfo();
            return true;
        }
        if (b10 != 17) {
            throw new IOException(String.format("Unknown block type %x.", Byte.valueOf(b10)));
        }
        readExecutionData();
        return true;
    }

    public void setExecutionDataVisitor(IExecutionDataVisitor iExecutionDataVisitor) {
        this.executionDataVisitor = iExecutionDataVisitor;
    }

    public void setSessionInfoVisitor(ISessionInfoVisitor iSessionInfoVisitor) {
        this.sessionInfoVisitor = iSessionInfoVisitor;
    }
}
