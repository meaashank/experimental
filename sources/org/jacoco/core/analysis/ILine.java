package org.jacoco.core.analysis;

/* JADX INFO: loaded from: classes6.dex */
public interface ILine {
    ICounter getBranchCounter();

    ICounter getInstructionCounter();

    int getStatus();
}
