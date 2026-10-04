package com.tonyodev.fetch2;

import androidx.collection.C1550p;
import androidx.compose.animation.C1635o;
import com.tonyodev.fetch2core.Extras;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public class RequestInfo implements Serializable {
    private int autoRetryMaxAttempts;

    @NotNull
    private Extras extras;
    private int groupId;
    private long identifier;

    @Nullable
    private String tag;

    @NotNull
    private final Map<String, String> headers = new LinkedHashMap();

    @NotNull
    private Priority priority = Ib.b.h();

    @NotNull
    private NetworkType networkType = Ib.b.f53019x;

    @NotNull
    private EnqueueAction enqueueAction = Ib.b.f52992D;
    private boolean downloadOnEnqueue = true;

    public RequestInfo() {
        Extras.CREATOR.getClass();
        this.extras = Extras.emptyExtras;
    }

    public final void addHeader(@NotNull String key, @NotNull String value) {
        G.p(key, "key");
        G.p(value, "value");
        this.headers.put(key, value);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        G.n(obj, "null cannot be cast to non-null type com.tonyodev.fetch2.RequestInfo");
        RequestInfo requestInfo = (RequestInfo) obj;
        return this.identifier == requestInfo.identifier && this.groupId == requestInfo.groupId && G.g(this.headers, requestInfo.headers) && this.priority == requestInfo.priority && this.networkType == requestInfo.networkType && G.g(this.tag, requestInfo.tag) && this.enqueueAction == requestInfo.enqueueAction && this.downloadOnEnqueue == requestInfo.downloadOnEnqueue && G.g(this.extras, requestInfo.extras) && this.autoRetryMaxAttempts == requestInfo.autoRetryMaxAttempts;
    }

    public final int getAutoRetryMaxAttempts() {
        return this.autoRetryMaxAttempts;
    }

    public final boolean getDownloadOnEnqueue() {
        return this.downloadOnEnqueue;
    }

    @NotNull
    public final EnqueueAction getEnqueueAction() {
        return this.enqueueAction;
    }

    @NotNull
    public final Extras getExtras() {
        return this.extras;
    }

    public final int getGroupId() {
        return this.groupId;
    }

    @NotNull
    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final long getIdentifier() {
        return this.identifier;
    }

    @NotNull
    public final NetworkType getNetworkType() {
        return this.networkType;
    }

    @NotNull
    public final Priority getPriority() {
        return this.priority;
    }

    @Nullable
    public final String getTag() {
        return this.tag;
    }

    public int hashCode() {
        int iHashCode = (this.networkType.hashCode() + ((this.priority.hashCode() + ((this.headers.hashCode() + (((C1550p.a(this.identifier) * 31) + this.groupId) * 31)) * 31)) * 31)) * 31;
        String str = this.tag;
        return ((this.extras.hashCode() + ((C1635o.a(this.downloadOnEnqueue) + ((this.enqueueAction.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31)) * 31) + this.autoRetryMaxAttempts;
    }

    public final void setAutoRetryMaxAttempts(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("The maximum number of attempts has to be greater than -1");
        }
        this.autoRetryMaxAttempts = i10;
    }

    public final void setDownloadOnEnqueue(boolean z10) {
        this.downloadOnEnqueue = z10;
    }

    public final void setEnqueueAction(@NotNull EnqueueAction enqueueAction) {
        G.p(enqueueAction, "<set-?>");
        this.enqueueAction = enqueueAction;
    }

    public final void setExtras(@NotNull Extras value) {
        G.p(value, "value");
        this.extras = value.copy();
    }

    public final void setGroupId(int i10) {
        this.groupId = i10;
    }

    public final void setIdentifier(long j10) {
        this.identifier = j10;
    }

    public final void setNetworkType(@NotNull NetworkType networkType) {
        G.p(networkType, "<set-?>");
        this.networkType = networkType;
    }

    public final void setPriority(@NotNull Priority priority) {
        G.p(priority, "<set-?>");
        this.priority = priority;
    }

    public final void setTag(@Nullable String str) {
        this.tag = str;
    }

    @NotNull
    public String toString() {
        return "RequestInfo(identifier=" + this.identifier + ", groupId=" + this.groupId + ", headers=" + this.headers + ", priority=" + this.priority + ", networkType=" + this.networkType + ", tag=" + this.tag + ", enqueueAction=" + this.enqueueAction + ", downloadOnEnqueue=" + this.downloadOnEnqueue + ", autoRetryMaxAttempts=" + this.autoRetryMaxAttempts + ", extras=" + this.extras + ")";
    }
}
