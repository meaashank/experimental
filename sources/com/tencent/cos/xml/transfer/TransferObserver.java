package com.tencent.cos.xml.transfer;

/* JADX INFO: loaded from: classes7.dex */
public class TransferObserver {
    private final String transferId;
    private TransferListener transferListener;
    private TransferState transferState;

    public TransferObserver(String str) {
        this.transferId = str;
    }

    public String getTransferId() {
        return this.transferId;
    }

    public TransferListener getTransferListener() {
        return this.transferListener;
    }

    public TransferState getTransferState() {
        return this.transferState;
    }

    public void setTransferListener(TransferListener transferListener) {
        this.transferListener = transferListener;
    }

    public void setTransferState(TransferState transferState) {
        this.transferState = transferState;
    }
}
