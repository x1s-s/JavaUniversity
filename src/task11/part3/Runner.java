package task11.part3;

import task3.progressed.Author;

import java.lang.reflect.Modifier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        System.out.println(classToString(Author.class));

    }

    @SuppressWarnings("rawtypes")
    public static String classToString(Class clazz){
        StringBuilder stringBuilder = new StringBuilder();
        Stream.of(clazz.getDeclaredFields()).forEach(z -> {
                    stringBuilder
                            .append(Modifier.toString(z.getModifiers()))
                            .append(" ")
                            .append(z.getType().getName())
                            .append(" ")
                            .append(z.getName())
                            .append(";\n");
                });

        Stream.of(clazz.getMethods()).forEach(x -> stringBuilder
                .append(Modifier.toString(x.getModifiers()))
                .append(" ")
                .append(x.getReturnType().getName())
                .append(" ").append(x.getName())
                .append("(")
                .append(
                        Stream.of(x.getParameters())
                                .map(y -> y.getType().getName() + " " + y.getName())
                                .collect(Collectors.joining(", ")))
                .append("){\n")
                .append(switch (x.getReturnType().getName()){
                    case "void" -> "";
                    case "int", "double", "float", "long", "short", "byte", "char" -> "\treturn 0;\n";
                    case "boolean" -> "\treturn false;\n";
                    default -> "\treturn null;\n";
                })
                .append("};\n"));

        return stringBuilder.toString();
    }
}

