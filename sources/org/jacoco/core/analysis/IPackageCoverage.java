package org.jacoco.core.analysis;

import java.util.Collection;

/* JADX INFO: loaded from: classes6.dex */
public interface IPackageCoverage extends ICoverageNode {
    Collection<IClassCoverage> getClasses();

    Collection<ISourceFileCoverage> getSourceFiles();
}
