package example.reporting.reportconverter.converter;

import example.reporting.reportconverter.report.TableRow;
import ma.glasnost.orika.CustomConverter;
import ma.glasnost.orika.metadata.Type;

import java.util.List;

class TableConverter extends CustomConverter<List<TableRow>, String[][]> {

    @Override
    public String[][] convert(List<TableRow> source, Type<? extends String[][]> destinationType) {
        if (source == null || source.isEmpty()) {
            return null;
        }

        final String[][] table = new String[source.size()][];

        int i = 0;
        for (final TableRow sourceRow : source) {
            String[] targetRow = new String[sourceRow.getCells().size()];
            int j = 0;
            for (String cell : sourceRow.getCells()) {
                targetRow[j] = cell;
                j++;
            }
            table[i] = targetRow;
            i++;
        }

        return table;
    }

}
