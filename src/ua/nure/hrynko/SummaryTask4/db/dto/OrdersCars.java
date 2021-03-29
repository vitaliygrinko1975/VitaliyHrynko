package ua.nure.hrynko.SummaryTask4.db.dto;


public class OrdersCars extends Entity {

    private static final long serialVersionUID = -6889036256149495388L;

        private Long orderId;

        private Long carId;

        public void setOrderId(Long orderId) {
            this.orderId = orderId;
        }

        public Long getOrderId() {
            return orderId;
        }

        public void setCarId(Long carId) {
            this.carId = carId;
        }

        public Long getCarId() {
            return carId;
        }

        @Override
        public String toString() {
            return "OrdersCar [orderId=" + orderId + ", carId=" + carId +"]";

        }

    }


