package com.google.firebase.sessions;

import androidx.compose.animation.C1636p;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class ProcessDetails {
    private final int importance;
    private final boolean isDefaultProcess;
    private final int pid;

    @NotNull
    private final String processName;

    public ProcessDetails(@NotNull String processName, int i10, int i11, boolean z10) {
        G.p(processName, "processName");
        this.processName = processName;
        this.pid = i10;
        this.importance = i11;
        this.isDefaultProcess = z10;
    }

    public static /* synthetic */ ProcessDetails copy$default(ProcessDetails processDetails, String str, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = processDetails.processName;
        }
        if ((i12 & 2) != 0) {
            i10 = processDetails.pid;
        }
        if ((i12 & 4) != 0) {
            i11 = processDetails.importance;
        }
        if ((i12 & 8) != 0) {
            z10 = processDetails.isDefaultProcess;
        }
        return processDetails.copy(str, i10, i11, z10);
    }

    @NotNull
    public final String component1() {
        return this.processName;
    }

    public final int component2() {
        return this.pid;
    }

    public final int component3() {
        return this.importance;
    }

    public final boolean component4() {
        return this.isDefaultProcess;
    }

    @NotNull
    public final ProcessDetails copy(@NotNull String processName, int i10, int i11, boolean z10) {
        G.p(processName, "processName");
        return new ProcessDetails(processName, i10, i11, z10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProcessDetails)) {
            return false;
        }
        ProcessDetails processDetails = (ProcessDetails) obj;
        return G.g(this.processName, processDetails.processName) && this.pid == processDetails.pid && this.importance == processDetails.importance && this.isDefaultProcess == processDetails.isDefaultProcess;
    }

    public final int getImportance() {
        return this.importance;
    }

    public final int getPid() {
        return this.pid;
    }

    @NotNull
    public final String getProcessName() {
        return this.processName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public int hashCode() {
        int iHashCode = ((((this.processName.hashCode() * 31) + this.pid) * 31) + this.importance) * 31;
        boolean z10 = this.isDefaultProcess;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        return iHashCode + r12;
    }

    public final boolean isDefaultProcess() {
        return this.isDefaultProcess;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ProcessDetails(processName=");
        sb2.append(this.processName);
        sb2.append(", pid=");
        sb2.append(this.pid);
        sb2.append(", importance=");
        sb2.append(this.importance);
        sb2.append(", isDefaultProcess=");
        return C1636p.a(sb2, this.isDefaultProcess, ')');
    }
}
