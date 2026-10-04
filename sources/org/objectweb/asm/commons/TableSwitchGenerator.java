package org.objectweb.asm.commons;

import org.objectweb.asm.Label;

/* JADX INFO: loaded from: classes8.dex */
public interface TableSwitchGenerator {
    void generateCase(int i10, Label label);

    void generateDefault();
}
