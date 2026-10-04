package com.tonyodev.fetch2.database;

import Ib.b;
import Ib.c;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.C1550p;
import androidx.compose.animation.C1635o;
import androidx.compose.foundation.layout.C1713x0;
import androidx.room.B;
import androidx.room.F;
import androidx.room.Index;
import androidx.room.InterfaceC2662g;
import androidx.room.InterfaceC2680q;
import androidx.room.P;
import com.tonyodev.fetch2.Download;
import com.tonyodev.fetch2.EnqueueAction;
import com.tonyodev.fetch2.Error;
import com.tonyodev.fetch2.NetworkType;
import com.tonyodev.fetch2.Priority;
import com.tonyodev.fetch2.Request;
import com.tonyodev.fetch2.Status;
import com.tonyodev.fetch2core.Extras;
import java.io.Serializable;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@InterfaceC2680q(indices = {@Index(unique = true, value = {DownloadDatabase.f194434v}), @Index(unique = false, value = {DownloadDatabase.f194435w, DownloadDatabase.f194416B})}, tableName = DownloadDatabase.f194430r)
public class DownloadInfo implements Download {

    @NotNull
    public static final a CREATOR = new a();

    @InterfaceC2662g(name = DownloadDatabase.f194426L, typeAffinity = 3)
    private int autoRetryAttempts;

    @InterfaceC2662g(name = DownloadDatabase.f194425K, typeAffinity = 3)
    private int autoRetryMaxAttempts;

    @InterfaceC2662g(name = DownloadDatabase.f194438z, typeAffinity = 3)
    private long downloaded;

    @B
    private long downloadedBytesPerSecond;

    @B
    private long etaInMilliSeconds;

    @InterfaceC2662g(name = DownloadDatabase.f194424J, typeAffinity = 2)
    @NotNull
    private Extras extras;

    @InterfaceC2662g(name = DownloadDatabase.f194435w, typeAffinity = 3)
    private int group;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @P
    @InterfaceC2662g(name = "_id", typeAffinity = 3)
    private int f194441id;

    @InterfaceC2662g(name = DownloadDatabase.f194422H, typeAffinity = 3)
    private long identifier;

    @InterfaceC2662g(name = DownloadDatabase.f194420F, typeAffinity = 2)
    @Nullable
    private String tag;

    @InterfaceC2662g(name = DownloadDatabase.f194432t, typeAffinity = 2)
    @NotNull
    private String namespace = "";

    @InterfaceC2662g(name = DownloadDatabase.f194433u, typeAffinity = 2)
    @NotNull
    private String url = "";

    @InterfaceC2662g(name = DownloadDatabase.f194434v, typeAffinity = 2)
    @NotNull
    private String file = "";

    @InterfaceC2662g(name = DownloadDatabase.f194436x, typeAffinity = 3)
    @NotNull
    private Priority priority = b.h();

    @InterfaceC2662g(name = DownloadDatabase.f194437y, typeAffinity = 2)
    @NotNull
    private Map<String, String> headers = new LinkedHashMap();

    @InterfaceC2662g(name = DownloadDatabase.f194415A, typeAffinity = 3)
    private long total = -1;

    @InterfaceC2662g(name = DownloadDatabase.f194416B, typeAffinity = 3)
    @NotNull
    private Status status = b.f52990B;

    @InterfaceC2662g(name = DownloadDatabase.f194417C, typeAffinity = 3)
    @NotNull
    private Error error = b.f52989A;

    @InterfaceC2662g(name = DownloadDatabase.f194418D, typeAffinity = 3)
    @NotNull
    private NetworkType networkType = b.f53019x;

    @InterfaceC2662g(name = DownloadDatabase.f194419E, typeAffinity = 3)
    private long created = Calendar.getInstance().getTimeInMillis();

    @InterfaceC2662g(name = DownloadDatabase.f194421G, typeAffinity = 3)
    @NotNull
    private EnqueueAction enqueueAction = EnqueueAction.REPLACE_EXISTING;

    @InterfaceC2662g(name = DownloadDatabase.f194423I, typeAffinity = 3)
    private boolean downloadOnEnqueue = true;

    public static final class a implements Parcelable.Creator<DownloadInfo> {
        public a() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public DownloadInfo createFromParcel(@NotNull Parcel source) {
            G.p(source, "source");
            int i10 = source.readInt();
            String string = source.readString();
            if (string == null) {
                string = "";
            }
            String string2 = source.readString();
            if (string2 == null) {
                string2 = "";
            }
            String string3 = source.readString();
            String str = string3 != null ? string3 : "";
            int i11 = source.readInt();
            Priority priorityA = Priority.Companion.a(source.readInt());
            Serializable serializable = source.readSerializable();
            G.n(serializable, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
            Map<String, String> map = (Map) serializable;
            long j10 = source.readLong();
            long j11 = source.readLong();
            Status statusA = Status.Companion.a(source.readInt());
            Error errorA = Error.Companion.a(source.readInt());
            NetworkType networkTypeA = NetworkType.Companion.a(source.readInt());
            long j12 = source.readLong();
            String string4 = source.readString();
            EnqueueAction enqueueActionA = EnqueueAction.Companion.a(source.readInt());
            long j13 = source.readLong();
            boolean z10 = source.readInt() == 1;
            long j14 = source.readLong();
            long j15 = source.readLong();
            Serializable serializable2 = source.readSerializable();
            G.n(serializable2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
            int i12 = source.readInt();
            int i13 = source.readInt();
            DownloadInfo downloadInfo = new DownloadInfo();
            downloadInfo.setId(i10);
            downloadInfo.setNamespace(string);
            downloadInfo.setUrl(string2);
            downloadInfo.setFile(str);
            downloadInfo.setGroup(i11);
            downloadInfo.setPriority(priorityA);
            downloadInfo.setHeaders(map);
            downloadInfo.setDownloaded(j10);
            downloadInfo.setTotal(j11);
            downloadInfo.setStatus(statusA);
            downloadInfo.setError(errorA);
            downloadInfo.setNetworkType(networkTypeA);
            downloadInfo.setCreated(j12);
            downloadInfo.setTag(string4);
            downloadInfo.setEnqueueAction(enqueueActionA);
            downloadInfo.setIdentifier(j13);
            downloadInfo.setDownloadOnEnqueue(z10);
            downloadInfo.setEtaInMilliSeconds(j14);
            downloadInfo.setDownloadedBytesPerSecond(j15);
            downloadInfo.setExtras(new Extras((Map) serializable2));
            downloadInfo.setAutoRetryMaxAttempts(i12);
            downloadInfo.setAutoRetryAttempts(i13);
            return downloadInfo;
        }

        @NotNull
        public DownloadInfo[] d(int i10) {
            return new DownloadInfo[i10];
        }

        @Override // android.os.Parcelable.Creator
        public DownloadInfo[] newArray(int i10) {
            return new DownloadInfo[i10];
        }

        public a(C4969v c4969v) {
        }
    }

    public DownloadInfo() {
        Extras.CREATOR.getClass();
        this.extras = Extras.emptyExtras;
        this.etaInMilliSeconds = -1L;
        this.downloadedBytesPerSecond = -1L;
    }

    @Override // com.tonyodev.fetch2.Download
    @NotNull
    public Download copy() {
        DownloadInfo downloadInfo = new DownloadInfo();
        c.b(this, downloadInfo);
        return downloadInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        G.n(obj, "null cannot be cast to non-null type com.tonyodev.fetch2.database.DownloadInfo");
        DownloadInfo downloadInfo = (DownloadInfo) obj;
        return getId() == downloadInfo.getId() && G.g(getNamespace(), downloadInfo.getNamespace()) && G.g(getUrl(), downloadInfo.getUrl()) && G.g(getFile(), downloadInfo.getFile()) && getGroup() == downloadInfo.getGroup() && getPriority() == downloadInfo.getPriority() && G.g(getHeaders(), downloadInfo.getHeaders()) && getDownloaded() == downloadInfo.getDownloaded() && getTotal() == downloadInfo.getTotal() && getStatus() == downloadInfo.getStatus() && getError() == downloadInfo.getError() && getNetworkType() == downloadInfo.getNetworkType() && getCreated() == downloadInfo.getCreated() && G.g(getTag(), downloadInfo.getTag()) && getEnqueueAction() == downloadInfo.getEnqueueAction() && getIdentifier() == downloadInfo.getIdentifier() && getDownloadOnEnqueue() == downloadInfo.getDownloadOnEnqueue() && G.g(getExtras(), downloadInfo.getExtras()) && getEtaInMilliSeconds() == downloadInfo.getEtaInMilliSeconds() && getDownloadedBytesPerSecond() == downloadInfo.getDownloadedBytesPerSecond() && getAutoRetryMaxAttempts() == downloadInfo.getAutoRetryMaxAttempts() && getAutoRetryAttempts() == downloadInfo.getAutoRetryAttempts();
    }

    @Override // com.tonyodev.fetch2.Download
    public int getAutoRetryAttempts() {
        return this.autoRetryAttempts;
    }

    @Override // com.tonyodev.fetch2.Download
    public int getAutoRetryMaxAttempts() {
        return this.autoRetryMaxAttempts;
    }

    @Override // com.tonyodev.fetch2.Download
    public long getCreated() {
        return this.created;
    }

    @Override // com.tonyodev.fetch2.Download
    public boolean getDownloadOnEnqueue() {
        return this.downloadOnEnqueue;
    }

    @Override // com.tonyodev.fetch2.Download
    public long getDownloaded() {
        return this.downloaded;
    }

    @Override // com.tonyodev.fetch2.Download
    public long getDownloadedBytesPerSecond() {
        return this.downloadedBytesPerSecond;
    }

    @Override // com.tonyodev.fetch2.Download
    @NotNull
    public EnqueueAction getEnqueueAction() {
        return this.enqueueAction;
    }

    @Override // com.tonyodev.fetch2.Download
    @NotNull
    public Error getError() {
        return this.error;
    }

    @Override // com.tonyodev.fetch2.Download
    public long getEtaInMilliSeconds() {
        return this.etaInMilliSeconds;
    }

    @Override // com.tonyodev.fetch2.Download
    @NotNull
    public Extras getExtras() {
        return this.extras;
    }

    @Override // com.tonyodev.fetch2.Download
    @NotNull
    public String getFile() {
        return this.file;
    }

    @Override // com.tonyodev.fetch2.Download
    @NotNull
    public Uri getFileUri() {
        return com.tonyodev.fetch2core.b.q(getFile());
    }

    @Override // com.tonyodev.fetch2.Download
    public int getGroup() {
        return this.group;
    }

    @Override // com.tonyodev.fetch2.Download
    @NotNull
    public Map<String, String> getHeaders() {
        return this.headers;
    }

    @Override // com.tonyodev.fetch2.Download
    public int getId() {
        return this.f194441id;
    }

    @Override // com.tonyodev.fetch2.Download
    public long getIdentifier() {
        return this.identifier;
    }

    @Override // com.tonyodev.fetch2.Download
    @NotNull
    public String getNamespace() {
        return this.namespace;
    }

    @Override // com.tonyodev.fetch2.Download
    @NotNull
    public NetworkType getNetworkType() {
        return this.networkType;
    }

    @Override // com.tonyodev.fetch2.Download
    @NotNull
    public Priority getPriority() {
        return this.priority;
    }

    @Override // com.tonyodev.fetch2.Download
    public int getProgress() {
        return com.tonyodev.fetch2core.b.c(getDownloaded(), getTotal());
    }

    @Override // com.tonyodev.fetch2.Download
    @NotNull
    public Request getRequest() {
        Request request = new Request(getUrl(), getFile());
        request.setGroupId(getGroup());
        request.getHeaders().putAll(getHeaders());
        request.setNetworkType(getNetworkType());
        request.setPriority(getPriority());
        request.setEnqueueAction(getEnqueueAction());
        request.setIdentifier(getIdentifier());
        request.setDownloadOnEnqueue(getDownloadOnEnqueue());
        request.setExtras(getExtras());
        request.setAutoRetryMaxAttempts(getAutoRetryMaxAttempts());
        return request;
    }

    @Override // com.tonyodev.fetch2.Download
    @NotNull
    public Status getStatus() {
        return this.status;
    }

    @Override // com.tonyodev.fetch2.Download
    @Nullable
    public String getTag() {
        return this.tag;
    }

    @Override // com.tonyodev.fetch2.Download
    public long getTotal() {
        return this.total;
    }

    @Override // com.tonyodev.fetch2.Download
    @NotNull
    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iA = (C1550p.a(getCreated()) + ((getNetworkType().hashCode() + ((getError().hashCode() + ((getStatus().hashCode() + ((C1550p.a(getTotal()) + ((C1550p.a(getDownloaded()) + ((getHeaders().hashCode() + ((getPriority().hashCode() + ((getGroup() + ((getFile().hashCode() + ((getUrl().hashCode() + ((getNamespace().hashCode() + (getId() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        String tag = getTag();
        return getAutoRetryAttempts() + ((getAutoRetryMaxAttempts() + ((C1550p.a(getDownloadedBytesPerSecond()) + ((C1550p.a(getEtaInMilliSeconds()) + ((getExtras().hashCode() + ((C1635o.a(getDownloadOnEnqueue()) + ((C1550p.a(getIdentifier()) + ((getEnqueueAction().hashCode() + ((iA + (tag != null ? tag.hashCode() : 0)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public void setAutoRetryAttempts(int i10) {
        this.autoRetryAttempts = i10;
    }

    public void setAutoRetryMaxAttempts(int i10) {
        this.autoRetryMaxAttempts = i10;
    }

    public void setCreated(long j10) {
        this.created = j10;
    }

    public void setDownloadOnEnqueue(boolean z10) {
        this.downloadOnEnqueue = z10;
    }

    public void setDownloaded(long j10) {
        this.downloaded = j10;
    }

    public void setDownloadedBytesPerSecond(long j10) {
        this.downloadedBytesPerSecond = j10;
    }

    public void setEnqueueAction(@NotNull EnqueueAction enqueueAction) {
        G.p(enqueueAction, "<set-?>");
        this.enqueueAction = enqueueAction;
    }

    public void setError(@NotNull Error error) {
        G.p(error, "<set-?>");
        this.error = error;
    }

    public void setEtaInMilliSeconds(long j10) {
        this.etaInMilliSeconds = j10;
    }

    public void setExtras(@NotNull Extras extras) {
        G.p(extras, "<set-?>");
        this.extras = extras;
    }

    public void setFile(@NotNull String str) {
        G.p(str, "<set-?>");
        this.file = str;
    }

    public void setGroup(int i10) {
        this.group = i10;
    }

    public void setHeaders(@NotNull Map<String, String> map) {
        G.p(map, "<set-?>");
        this.headers = map;
    }

    public void setId(int i10) {
        this.f194441id = i10;
    }

    public void setIdentifier(long j10) {
        this.identifier = j10;
    }

    public void setNamespace(@NotNull String str) {
        G.p(str, "<set-?>");
        this.namespace = str;
    }

    public void setNetworkType(@NotNull NetworkType networkType) {
        G.p(networkType, "<set-?>");
        this.networkType = networkType;
    }

    public void setPriority(@NotNull Priority priority) {
        G.p(priority, "<set-?>");
        this.priority = priority;
    }

    public void setStatus(@NotNull Status status) {
        G.p(status, "<set-?>");
        this.status = status;
    }

    public void setTag(@Nullable String str) {
        this.tag = str;
    }

    public void setTotal(long j10) {
        this.total = j10;
    }

    public void setUrl(@NotNull String str) {
        G.p(str, "<set-?>");
        this.url = str;
    }

    @NotNull
    public String toString() {
        int id2 = getId();
        String namespace = getNamespace();
        String url = getUrl();
        String file = getFile();
        int group = getGroup();
        Priority priority = getPriority();
        Map<String, String> headers = getHeaders();
        long downloaded = getDownloaded();
        long total = getTotal();
        Status status = getStatus();
        Error error = getError();
        NetworkType networkType = getNetworkType();
        long created = getCreated();
        String tag = getTag();
        EnqueueAction enqueueAction = getEnqueueAction();
        long identifier = getIdentifier();
        boolean downloadOnEnqueue = getDownloadOnEnqueue();
        Extras extras = getExtras();
        int autoRetryMaxAttempts = getAutoRetryMaxAttempts();
        int autoRetryAttempts = getAutoRetryAttempts();
        long etaInMilliSeconds = getEtaInMilliSeconds();
        long downloadedBytesPerSecond = getDownloadedBytesPerSecond();
        StringBuilder sb2 = new StringBuilder("DownloadInfo(id=");
        sb2.append(id2);
        sb2.append(", namespace='");
        sb2.append(namespace);
        sb2.append("', url='");
        F.a(sb2, url, "', file='", file, "', group=");
        sb2.append(group);
        sb2.append(", priority=");
        sb2.append(priority);
        sb2.append(", headers=");
        sb2.append(headers);
        sb2.append(", downloaded=");
        sb2.append(downloaded);
        C1713x0.a(sb2, ", total=", total, ", status=");
        sb2.append(status);
        sb2.append(", error=");
        sb2.append(error);
        sb2.append(", networkType=");
        sb2.append(networkType);
        sb2.append(", created=");
        sb2.append(created);
        sb2.append(", tag=");
        sb2.append(tag);
        sb2.append(", enqueueAction=");
        sb2.append(enqueueAction);
        C1713x0.a(sb2, ", identifier=", identifier, ", downloadOnEnqueue=");
        sb2.append(downloadOnEnqueue);
        sb2.append(", extras=");
        sb2.append(extras);
        sb2.append(", autoRetryMaxAttempts=");
        androidx.viewpager.widget.a.a(sb2, autoRetryMaxAttempts, ", autoRetryAttempts=", autoRetryAttempts, ", etaInMilliSeconds=");
        sb2.append(etaInMilliSeconds);
        sb2.append(", downloadedBytesPerSecond=");
        sb2.append(downloadedBytesPerSecond);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i10) {
        G.p(dest, "dest");
        dest.writeInt(getId());
        dest.writeString(getNamespace());
        dest.writeString(getUrl());
        dest.writeString(getFile());
        dest.writeInt(getGroup());
        dest.writeInt(getPriority().getValue());
        dest.writeSerializable(new HashMap(getHeaders()));
        dest.writeLong(getDownloaded());
        dest.writeLong(getTotal());
        dest.writeInt(getStatus().getValue());
        dest.writeInt(getError().getValue());
        dest.writeInt(getNetworkType().getValue());
        dest.writeLong(getCreated());
        dest.writeString(getTag());
        dest.writeInt(getEnqueueAction().getValue());
        dest.writeLong(getIdentifier());
        dest.writeInt(getDownloadOnEnqueue() ? 1 : 0);
        dest.writeLong(getEtaInMilliSeconds());
        dest.writeLong(getDownloadedBytesPerSecond());
        dest.writeSerializable(new HashMap(getExtras().getMap()));
        dest.writeInt(getAutoRetryMaxAttempts());
        dest.writeInt(getAutoRetryAttempts());
    }
}
