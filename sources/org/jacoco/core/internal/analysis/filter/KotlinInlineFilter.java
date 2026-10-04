package org.jacoco.core.internal.analysis.filter;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.regex.Pattern;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.LineNumberNode;
import org.objectweb.asm.tree.MethodNode;
import w.y;

/* JADX INFO: loaded from: classes6.dex */
public final class KotlinInlineFilter implements IFilter {
    private int firstGeneratedLineNumber = -1;
    private static final Pattern LINE_INFO_PATTERN = Pattern.compile("([0-9]++)(#[0-9]++)?+(,[0-9]++)?+:([0-9]++)(,[0-9]++)?+");
    private static final Pattern FILE_INFO_PATTERN = Pattern.compile("\\+ ([0-9]++) (.++)");

    private static void expectLine(BufferedReader bufferedReader, String str) throws IOException {
        String line = bufferedReader.readLine();
        if (!str.equals(line)) {
            throw new IllegalStateException(y.a("Unexpected SMAP line: ", line));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00da, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int getFirstGeneratedLineNumber(java.lang.String r8, java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jacoco.core.internal.analysis.filter.KotlinInlineFilter.getFirstGeneratedLineNumber(java.lang.String, java.lang.String):int");
    }

    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(MethodNode methodNode, IFilterContext iFilterContext, IFilterOutput iFilterOutput) {
        if (iFilterContext.getSourceDebugExtension() != null && KotlinGeneratedFilter.isKotlinClass(iFilterContext)) {
            if (this.firstGeneratedLineNumber == -1) {
                this.firstGeneratedLineNumber = getFirstGeneratedLineNumber(iFilterContext.getSourceFileName(), iFilterContext.getSourceDebugExtension());
            }
            int i10 = 0;
            for (AbstractInsnNode abstractInsnNode : methodNode.instructions) {
                if (15 == abstractInsnNode.getType()) {
                    i10 = ((LineNumberNode) abstractInsnNode).line;
                }
                if (i10 >= this.firstGeneratedLineNumber) {
                    iFilterOutput.ignore(abstractInsnNode, abstractInsnNode);
                }
            }
        }
    }
}
