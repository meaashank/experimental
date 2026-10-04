package org.jacoco.core.data;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class ExecutionData {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final long f226134id;
    private final String name;
    private final boolean[] probes;

    public ExecutionData(long j10, String str, boolean[] zArr) {
        this.f226134id = j10;
        this.name = str;
        this.probes = zArr;
    }

    public void assertCompatibility(long j10, String str, int i10) throws IllegalStateException {
        if (this.f226134id != j10) {
            throw new IllegalStateException(String.format("Different ids (%016x and %016x).", Long.valueOf(this.f226134id), Long.valueOf(j10)));
        }
        if (!this.name.equals(str)) {
            throw new IllegalStateException(String.format("Different class names %s and %s for id %016x.", this.name, str, Long.valueOf(j10)));
        }
        if (this.probes.length != i10) {
            throw new IllegalStateException(String.format("Incompatible execution data for class %s with id %016x.", str, Long.valueOf(j10)));
        }
    }

    public long getId() {
        return this.f226134id;
    }

    public String getName() {
        return this.name;
    }

    public boolean[] getProbes() {
        return this.probes;
    }

    public boolean hasHits() {
        for (boolean z10 : this.probes) {
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public void merge(ExecutionData executionData) {
        merge(executionData, true);
    }

    public void reset() {
        Arrays.fill(this.probes, false);
    }

    public String toString() {
        return String.format("ExecutionData[name=%s, id=%016x]", this.name, Long.valueOf(this.f226134id));
    }

    public void merge(ExecutionData executionData, boolean z10) {
        assertCompatibility(executionData.getId(), executionData.getName(), executionData.getProbes().length);
        boolean[] probes = executionData.getProbes();
        int i10 = 0;
        while (true) {
            boolean[] zArr = this.probes;
            if (i10 >= zArr.length) {
                return;
            }
            if (probes[i10]) {
                zArr[i10] = z10;
            }
            i10++;
        }
    }

    public ExecutionData(long j10, String str, int i10) {
        this.f226134id = j10;
        this.name = str;
        this.probes = new boolean[i10];
    }
}
