package org.jacoco.core.internal.analysis;

import java.util.ArrayList;
import java.util.Collection;
import org.jacoco.core.analysis.IClassCoverage;
import org.jacoco.core.analysis.ICoverageNode;
import org.jacoco.core.analysis.IMethodCoverage;
import org.jacoco.core.analysis.ISourceNode;

/* JADX INFO: loaded from: classes6.dex */
public class ClassCoverageImpl extends SourceNodeImpl implements IClassCoverage {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final long f226138id;
    private String[] interfaces;
    private final Collection<IMethodCoverage> methods;
    private final boolean noMatch;
    private String signature;
    private String sourceFileName;
    private String superName;

    public ClassCoverageImpl(String str, long j10, boolean z10) {
        super(ICoverageNode.ElementType.CLASS, str);
        this.f226138id = j10;
        this.noMatch = z10;
        this.methods = new ArrayList();
    }

    public void addMethod(IMethodCoverage iMethodCoverage) {
        this.methods.add(iMethodCoverage);
        increment((ISourceNode) iMethodCoverage);
        if (this.methodCounter.getCoveredCount() > 0) {
            this.classCounter = CounterImpl.COUNTER_0_1;
        } else {
            this.classCounter = CounterImpl.COUNTER_1_0;
        }
    }

    @Override // org.jacoco.core.analysis.IClassCoverage
    public long getId() {
        return this.f226138id;
    }

    @Override // org.jacoco.core.analysis.IClassCoverage
    public String[] getInterfaceNames() {
        return this.interfaces;
    }

    @Override // org.jacoco.core.analysis.IClassCoverage
    public Collection<IMethodCoverage> getMethods() {
        return this.methods;
    }

    @Override // org.jacoco.core.analysis.IClassCoverage
    public String getPackageName() {
        int iLastIndexOf = getName().lastIndexOf(47);
        return iLastIndexOf == -1 ? "" : getName().substring(0, iLastIndexOf);
    }

    @Override // org.jacoco.core.analysis.IClassCoverage
    public String getSignature() {
        return this.signature;
    }

    @Override // org.jacoco.core.analysis.IClassCoverage
    public String getSourceFileName() {
        return this.sourceFileName;
    }

    @Override // org.jacoco.core.analysis.IClassCoverage
    public String getSuperName() {
        return this.superName;
    }

    @Override // org.jacoco.core.analysis.IClassCoverage
    public boolean isNoMatch() {
        return this.noMatch;
    }

    public void setInterfaces(String[] strArr) {
        this.interfaces = strArr;
    }

    public void setSignature(String str) {
        this.signature = str;
    }

    public void setSourceFileName(String str) {
        this.sourceFileName = str;
    }

    public void setSuperName(String str) {
        this.superName = str;
    }
}
