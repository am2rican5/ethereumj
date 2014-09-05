package org.ethereum.gui;

import org.ethereum.core.Block;

import javax.swing.table.AbstractTableModel;

/**
 * www.ethereumJ.com
 *
 * @author: Roman Mandeleil
 * Created on: 15/05/14 12:42
 */
public class BlockTableModel extends AbstractTableModel {

    @Override
    public int getRowCount() {

        fireTableDataChanged();
        int rowCount = (int) UIEthereumManager.ethereum.getBlockChainSize();
        return rowCount;
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        Block block = UIEthereumManager.ethereum.getBlockByIndex(rowIndex);

        if (block == null) return "";

        return block.toString();
    }
}
