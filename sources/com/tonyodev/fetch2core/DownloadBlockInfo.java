package com.tonyodev.fetch2core;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.f;
import androidx.collection.C1545m0;
import androidx.collection.C1550p;
import androidx.compose.foundation.layout.C1713x0;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class DownloadBlockInfo implements DownloadBlock {

    @NotNull
    public static final a CREATOR = new a();
    private int downloadId = -1;
    private int blockPosition = -1;
    private long startByte = -1;
    private long endByte = -1;
    private long downloadedBytes = -1;

    public static final class a implements Parcelable.Creator<DownloadBlockInfo> {
        public a() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public DownloadBlockInfo createFromParcel(@NotNull Parcel source) {
            G.p(source, "source");
            DownloadBlockInfo downloadBlockInfo = new DownloadBlockInfo();
            downloadBlockInfo.setDownloadId(source.readInt());
            downloadBlockInfo.setBlockPosition(source.readInt());
            downloadBlockInfo.setStartByte(source.readLong());
            downloadBlockInfo.setEndByte(source.readLong());
            downloadBlockInfo.setDownloadedBytes(source.readLong());
            return downloadBlockInfo;
        }

        @NotNull
        public DownloadBlockInfo[] d(int i10) {
            return new DownloadBlockInfo[i10];
        }

        @Override // android.os.Parcelable.Creator
        public DownloadBlockInfo[] newArray(int i10) {
            return new DownloadBlockInfo[i10];
        }

        public a(C4969v c4969v) {
        }
    }

    @Override // com.tonyodev.fetch2core.DownloadBlock
    @NotNull
    public DownloadBlock copy() {
        DownloadBlockInfo downloadBlockInfo = new DownloadBlockInfo();
        downloadBlockInfo.setDownloadId(getDownloadId());
        downloadBlockInfo.setBlockPosition(getBlockPosition());
        downloadBlockInfo.setStartByte(getStartByte());
        downloadBlockInfo.setEndByte(getEndByte());
        downloadBlockInfo.setDownloadedBytes(getDownloadedBytes());
        return downloadBlockInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!DownloadBlockInfo.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        G.n(obj, "null cannot be cast to non-null type com.tonyodev.fetch2core.DownloadBlockInfo");
        DownloadBlockInfo downloadBlockInfo = (DownloadBlockInfo) obj;
        return getDownloadId() == downloadBlockInfo.getDownloadId() && getBlockPosition() == downloadBlockInfo.getBlockPosition() && getStartByte() == downloadBlockInfo.getStartByte() && getEndByte() == downloadBlockInfo.getEndByte() && getDownloadedBytes() == downloadBlockInfo.getDownloadedBytes();
    }

    @Override // com.tonyodev.fetch2core.DownloadBlock
    public int getBlockPosition() {
        return this.blockPosition;
    }

    @Override // com.tonyodev.fetch2core.DownloadBlock
    public int getDownloadId() {
        return this.downloadId;
    }

    @Override // com.tonyodev.fetch2core.DownloadBlock
    public long getDownloadedBytes() {
        return this.downloadedBytes;
    }

    @Override // com.tonyodev.fetch2core.DownloadBlock
    public long getEndByte() {
        return this.endByte;
    }

    @Override // com.tonyodev.fetch2core.DownloadBlock
    public int getProgress() {
        return b.c(getDownloadedBytes(), getEndByte() - getStartByte());
    }

    @Override // com.tonyodev.fetch2core.DownloadBlock
    public long getStartByte() {
        return this.startByte;
    }

    public int hashCode() {
        return C1550p.a(getDownloadedBytes()) + ((C1550p.a(getEndByte()) + ((C1550p.a(getStartByte()) + ((getBlockPosition() + (getDownloadId() * 31)) * 31)) * 31)) * 31);
    }

    public void setBlockPosition(int i10) {
        this.blockPosition = i10;
    }

    public void setDownloadId(int i10) {
        this.downloadId = i10;
    }

    public void setDownloadedBytes(long j10) {
        this.downloadedBytes = j10;
    }

    public void setEndByte(long j10) {
        this.endByte = j10;
    }

    public void setStartByte(long j10) {
        this.startByte = j10;
    }

    @NotNull
    public String toString() {
        int downloadId = getDownloadId();
        int blockPosition = getBlockPosition();
        long startByte = getStartByte();
        long endByte = getEndByte();
        long downloadedBytes = getDownloadedBytes();
        StringBuilder sbA = C1545m0.a("DownloadBlock(downloadId=", downloadId, ", blockPosition=", blockPosition, ", startByte=");
        sbA.append(startByte);
        C1713x0.a(sbA, ", endByte=", endByte, ", downloadedBytes=");
        return f.a(sbA, downloadedBytes, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i10) {
        G.p(dest, "dest");
        dest.writeInt(getDownloadId());
        dest.writeInt(getBlockPosition());
        dest.writeLong(getStartByte());
        dest.writeLong(getEndByte());
        dest.writeLong(getDownloadedBytes());
    }
}
