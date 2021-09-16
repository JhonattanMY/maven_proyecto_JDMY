package ejercicios.clases.wrappers;

public class MainWrappers {

	public static void main(String[] args) {
		// BYTE
		byte datoByte = 2; // PRIMITIVO
		Byte datoByteWrapper = 3;// wRAPPER
		System.out.println("Primitivo: " + datoByte);
		System.out.println("Wrapper: " + datoByteWrapper);

		// CONVERSIONES
		byte datoByte2 = 6;
		Byte datoConvertido = datoByte2;
		System.out.println("byte convertido: " + datoConvertido);

		// CONVERSION2
		Byte datoConvertido2 = 6;
		byte datoByte3 = datoConvertido2.byteValue();
		System.out.println("Byte convertido: " + datoByte3);

		
		// SHORT
		short datoShort = 1; // PRIMITIVO
		Short datoShortWrapper = 1;// wRAPPER
		System.out.println("Primitivo: " + datoShort);
		System.out.println("Wrapper: " + datoShortWrapper);

		// CONVERSIONES
		short datoShort2 = 5;
		Short datoConvertidoShort = datoShort2;
		System.out.println("short convertido: " + datoConvertidoShort);
		
		//CONVERSIONES 2
		Short datoWrap = 9;
		short datoConvertir2 = datoWrap.shortValue();
		System.out.println("Short convertido: " + datoConvertir2);
		
		

		// INT
		int edad = 20; // PRIMITIVO
		Integer edadWrapper = 22; // wRAPPER
		System.out.println("Primitivo: " + edad);
		System.out.println("Wrapper: " + edadWrapper);

		// CONVERSIONES

		int edad2 = 40;
		Integer edadConvertida = edad2;
		System.out.println("Int convertido: " + edadConvertida);

		// CONVERSIONES 2
		Integer integerConvertir = 23;
		int edad3 = integerConvertir.intValue();
		System.out.println("Integer convertido: " + edad3);
		
		

		// LONG
		long valorGrande = 1254777; // PRIMITIVO
		Long valorGrandeWrapper = 1234599L; // wRAPPER
		System.out.println("Primitivo: " + valorGrande);
		System.out.println("Wrapper: " + valorGrandeWrapper);

		// CONVERSIONES
		long long1 = 997748;
		Long longConvertido = long1;
		System.out.println("long convertido: " + longConvertido);

		// CONVERSIONES 2
		Long longWrapper = 493827L;
		long long2 = longWrapper.longValue();
		System.out.println("Long convertido: " + long2);
		
		

		// BOOLEAN
		boolean bool1 = true; // PRIMITIVO
		Boolean boolWrapper = false; // WRAPPER
		System.out.println("Primitivo: " + bool1);
		System.out.println("Wrapper: " + boolWrapper);

		// CONVERSIONES
		boolean bool2 = false;
		Boolean boolConvertido = bool2;
		System.out.println("boolean convertido: " + boolConvertido);

		// CONVERSIONES 2
		Boolean booWrap = true;
		boolean boolConvertido2 = booWrap.booleanValue();
		System.out.println("Boolean convertido: " + boolConvertido2);
		
		

		// FLOAT
		float float1 = 123.12f;// PRIMITIVO
		Float floatWrapper = 567.23F;// WRAPPER
		System.out.println("Primitivo: " + float1);
		System.out.println("Wrapper: " + floatWrapper);

		// CONVERSIONES
		float float2 = 144.56f;
		Float floatConvertido = float2;
		System.out.println("float convertido: " + floatConvertido);

		// CONVERSIONES 2
		Float floatWrap = 99.67F;
		float floatConvertido2 = floatWrap.floatValue();
		System.out.println("Float convertido: " + floatConvertido2);
		
		

		// DOUBLE
		double doub1 = 12.2;// PRIMITIVO
		Double doubWrapper = 24.64;// WRAPPER
		System.out.println("Primitivo: " + doub1);
		System.out.println("Wrapper: " + doubWrapper);

		// CONVERSIONES
		double doub2 = 90.34;
		Double doubConvertido = doub2;
		System.out.println("double convertido: " + doubConvertido);

		// CONVERSIONES 2
		Double doubWrap = 789.12;
		double doubConvertir2 = doubWrap.doubleValue();
		System.out.println("Double convertido: " + doubConvertir2);
		
		

		// CHAR
		char char1 = 'J';// PRIMITIVO
		Character charWrapper = 'M';// WRAPPER
		System.out.println("Primitivo: " + char1);
		System.out.println("Wrapper: " + charWrapper);

		// CONVERSIONES
		char char2 = 'd';
		Character charConvertido = char2;
		System.out.println("char convertido: " + charConvertido);

		// CONVERSINES 2
		Character charWrap = 'T';
		char charConvertido2 = charWrap.charValue();
		System.out.println("Char convertido: " + charConvertido2);
	}

}
