package ua.nure.hrynko.SummaryTask4.db.dao.interfaces;

import ua.nure.hrynko.SummaryTask4.db.dto.Cars;
import ua.nure.hrynko.SummaryTask4.db.dto.Orders;
import ua.nure.hrynko.SummaryTask4.exception.DBException;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface OrderMenuDAO {
    /**
     * Returns menu items of the given order.
     *
     * @param order
     *            Order entity.
     * @return List of menu item entities.
     */
     List<Cars> findMenuItems(Orders order) throws DBException;

     Cars extractMenuItem(ResultSet rs) throws SQLException;

}
