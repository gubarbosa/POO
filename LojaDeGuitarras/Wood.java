package com.guitar;

public enum Wood {
	INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY, MAPLE, COCOBOLO, CEDAR, ADIRONDACK, ALDER, SITKA;

	public String toString() {
		switch (this) {
		case INDIAN_ROSEWOOD:
			return "indian_rosewood";
		case BRAZILIAN_ROSEWOOD:
			return "brazilian_rosewood";
		case MAHOGANY:
			return "mahogany";
		case MAPLE:
			return "maple";
		case COCOBOLO:
			return "ococobolo";
		case CEDAR:
			return "cedar";
		case ADIRONDACK:
			return "adirondack";
		case ALDER:
			return "alder";
		case SITKA:
			return "sitka";
		}
		return null;
	}
}
