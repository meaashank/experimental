package com.android.launcher3.model.nano;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public interface LauncherDumpProto {

    public interface ContainerType {
        public static final int FOLDER = 3;
        public static final int HOTSEAT = 2;
        public static final int UNKNOWN_CONTAINERTYPE = 0;
        public static final int WORKSPACE = 1;
    }

    public static final class DumpTarget extends MessageNano {
        private static volatile DumpTarget[] _emptyArray;
        public String component;
        public int containerType;
        public int gridX;
        public int gridY;
        public String itemId;
        public int itemType;
        public String packageName;
        public int pageId;
        public int spanX;
        public int spanY;
        public int type;
        public int userType;

        public interface Type {
            public static final int CONTAINER = 2;
            public static final int ITEM = 1;
            public static final int NONE = 0;
        }

        public DumpTarget() {
            clear();
        }

        public static DumpTarget[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new DumpTarget[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static DumpTarget parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (DumpTarget) MessageNano.mergeFrom(new DumpTarget(), bArr);
        }

        public DumpTarget clear() {
            this.type = 0;
            this.pageId = 0;
            this.gridX = 0;
            this.gridY = 0;
            this.containerType = 0;
            this.itemType = 0;
            this.packageName = "";
            this.component = "";
            this.itemId = "";
            this.spanX = 1;
            this.spanY = 1;
            this.userType = 0;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.MessageNano
        public int computeSerializedSize() {
            int iComputeSerializedSize = super.computeSerializedSize();
            int i10 = this.type;
            if (i10 != 0) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i10);
            }
            int i11 = this.pageId;
            if (i11 != 0) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(2, i11);
            }
            int i12 = this.gridX;
            if (i12 != 0) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i12);
            }
            int i13 = this.gridY;
            if (i13 != 0) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i13);
            }
            int i14 = this.containerType;
            if (i14 != 0) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(5, i14);
            }
            int i15 = this.itemType;
            if (i15 != 0) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(6, i15);
            }
            if (!this.packageName.equals("")) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(7, this.packageName);
            }
            if (!this.component.equals("")) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(8, this.component);
            }
            if (!this.itemId.equals("")) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(9, this.itemId);
            }
            int i16 = this.spanX;
            if (i16 != 1) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(10, i16);
            }
            int i17 = this.spanY;
            if (i17 != 1) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(11, i17);
            }
            int i18 = this.userType;
            return i18 != 0 ? CodedOutputByteBufferNano.computeInt32Size(12, i18) + iComputeSerializedSize : iComputeSerializedSize;
        }

        @Override // com.google.protobuf.nano.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            int i10 = this.type;
            if (i10 != 0) {
                codedOutputByteBufferNano.writeInt32(1, i10);
            }
            int i11 = this.pageId;
            if (i11 != 0) {
                codedOutputByteBufferNano.writeInt32(2, i11);
            }
            int i12 = this.gridX;
            if (i12 != 0) {
                codedOutputByteBufferNano.writeInt32(3, i12);
            }
            int i13 = this.gridY;
            if (i13 != 0) {
                codedOutputByteBufferNano.writeInt32(4, i13);
            }
            int i14 = this.containerType;
            if (i14 != 0) {
                codedOutputByteBufferNano.writeInt32(5, i14);
            }
            int i15 = this.itemType;
            if (i15 != 0) {
                codedOutputByteBufferNano.writeInt32(6, i15);
            }
            if (!this.packageName.equals("")) {
                codedOutputByteBufferNano.writeString(7, this.packageName);
            }
            if (!this.component.equals("")) {
                codedOutputByteBufferNano.writeString(8, this.component);
            }
            if (!this.itemId.equals("")) {
                codedOutputByteBufferNano.writeString(9, this.itemId);
            }
            int i16 = this.spanX;
            if (i16 != 1) {
                codedOutputByteBufferNano.writeInt32(10, i16);
            }
            int i17 = this.spanY;
            if (i17 != 1) {
                codedOutputByteBufferNano.writeInt32(11, i17);
            }
            int i18 = this.userType;
            if (i18 != 0) {
                codedOutputByteBufferNano.writeInt32(12, i18);
            }
            super.writeTo(codedOutputByteBufferNano);
        }

        public static DumpTarget parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new DumpTarget().mergeFrom(codedInputByteBufferNano);
        }

        @Override // com.google.protobuf.nano.MessageNano
        public DumpTarget mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                switch (tag) {
                    case 0:
                        break;
                    case 8:
                        int int32 = codedInputByteBufferNano.readInt32();
                        if (int32 == 0 || int32 == 1 || int32 == 2) {
                            this.type = int32;
                        }
                        break;
                    case 16:
                        this.pageId = codedInputByteBufferNano.readInt32();
                        break;
                    case 24:
                        this.gridX = codedInputByteBufferNano.readInt32();
                        break;
                    case 32:
                        this.gridY = codedInputByteBufferNano.readInt32();
                        break;
                    case 40:
                        int int322 = codedInputByteBufferNano.readInt32();
                        if (int322 == 0 || int322 == 1 || int322 == 2 || int322 == 3) {
                            this.containerType = int322;
                        }
                        break;
                    case 48:
                        int int323 = codedInputByteBufferNano.readInt32();
                        if (int323 == 0 || int323 == 1 || int323 == 2 || int323 == 3) {
                            this.itemType = int323;
                        }
                        break;
                    case 58:
                        this.packageName = codedInputByteBufferNano.readString();
                        break;
                    case 66:
                        this.component = codedInputByteBufferNano.readString();
                        break;
                    case 74:
                        this.itemId = codedInputByteBufferNano.readString();
                        break;
                    case 80:
                        this.spanX = codedInputByteBufferNano.readInt32();
                        break;
                    case 88:
                        this.spanY = codedInputByteBufferNano.readInt32();
                        break;
                    case 96:
                        int int324 = codedInputByteBufferNano.readInt32();
                        if (int324 == 0 || int324 == 1) {
                            this.userType = int324;
                        }
                        break;
                    default:
                        if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                        }
                        break;
                }
            }
            return this;
        }
    }

    public interface ItemType {
        public static final int APP_ICON = 1;
        public static final int SHORTCUT = 3;
        public static final int UNKNOWN_ITEMTYPE = 0;
        public static final int WIDGET = 2;
    }

    public static final class LauncherImpression extends MessageNano {
        private static volatile LauncherImpression[] _emptyArray;
        public DumpTarget[] targets;

        public LauncherImpression() {
            clear();
        }

        public static LauncherImpression[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new LauncherImpression[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static LauncherImpression parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (LauncherImpression) MessageNano.mergeFrom(new LauncherImpression(), bArr);
        }

        public LauncherImpression clear() {
            this.targets = DumpTarget.emptyArray();
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.MessageNano
        public int computeSerializedSize() {
            int iComputeSerializedSize = super.computeSerializedSize();
            DumpTarget[] dumpTargetArr = this.targets;
            if (dumpTargetArr != null && dumpTargetArr.length > 0) {
                int i10 = 0;
                while (true) {
                    DumpTarget[] dumpTargetArr2 = this.targets;
                    if (i10 >= dumpTargetArr2.length) {
                        break;
                    }
                    DumpTarget dumpTarget = dumpTargetArr2[i10];
                    if (dumpTarget != null) {
                        iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, dumpTarget) + iComputeSerializedSize;
                    }
                    i10++;
                }
            }
            return iComputeSerializedSize;
        }

        @Override // com.google.protobuf.nano.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            DumpTarget[] dumpTargetArr = this.targets;
            if (dumpTargetArr != null && dumpTargetArr.length > 0) {
                int i10 = 0;
                while (true) {
                    DumpTarget[] dumpTargetArr2 = this.targets;
                    if (i10 >= dumpTargetArr2.length) {
                        break;
                    }
                    DumpTarget dumpTarget = dumpTargetArr2[i10];
                    if (dumpTarget != null) {
                        codedOutputByteBufferNano.writeMessage(1, dumpTarget);
                    }
                    i10++;
                }
            }
            super.writeTo(codedOutputByteBufferNano);
        }

        public static LauncherImpression parseFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            return new LauncherImpression().mergeFrom(codedInputByteBufferNano);
        }

        @Override // com.google.protobuf.nano.MessageNano
        public LauncherImpression mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 10) {
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                    DumpTarget[] dumpTargetArr = this.targets;
                    int length = dumpTargetArr == null ? 0 : dumpTargetArr.length;
                    int i10 = repeatedFieldArrayLength + length;
                    DumpTarget[] dumpTargetArr2 = new DumpTarget[i10];
                    if (length != 0) {
                        System.arraycopy(dumpTargetArr, 0, dumpTargetArr2, 0, length);
                    }
                    while (length < i10 - 1) {
                        DumpTarget dumpTarget = new DumpTarget();
                        dumpTargetArr2[length] = dumpTarget;
                        codedInputByteBufferNano.readMessage(dumpTarget);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    DumpTarget dumpTarget2 = new DumpTarget();
                    dumpTargetArr2[length] = dumpTarget2;
                    codedInputByteBufferNano.readMessage(dumpTarget2);
                    this.targets = dumpTargetArr2;
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }
    }

    public interface UserType {
        public static final int DEFAULT = 0;
        public static final int WORK = 1;
    }
}
