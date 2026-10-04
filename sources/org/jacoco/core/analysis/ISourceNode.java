package org.jacoco.core.analysis;

/* JADX INFO: loaded from: classes6.dex */
public interface ISourceNode extends ICoverageNode {
    public static final int UNKNOWN_LINE = -1;

    int getFirstLine();

    int getLastLine();

    ILine getLine(int i10);
}
