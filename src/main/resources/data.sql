use `online-fashion`;



INSERT INTO `category`(`id`, `name`) VALUES (1,'Beauty');
INSERT INTO `category`(`id`, `name`) VALUES (2,'shoes');

INSERT INTO `ordered_product`(`id`, `brand`, `name`, `price`, `quantity`, `category_id`) VALUES (1,'ponse','cream',500,2,1);
INSERT INTO `ordered_product`(`id`, `brand`, `name`, `price`, `quantity`, `category_id`) VALUES (2,'redcheif','shoes',3000,1,2);

INSERT INTO `order_data`(`id`, `date`, `order_amount`, `status`, `userdata`) VALUES ('[value-1]','[value-2]','[value-3]','[value-4]','[value-5]');

INSERT INTO `product`(`id`, `brand`, `name`, `price`, `quantity`, `category_id`) VALUES ('[value-1]','[value-2]','[value-3]','[value-4]','[value-5]','[value-6]','[value-7]');

INSERT INTO `role`(`id`, `role_name`) VALUES (1,'user');
INSERT INTO `role`(`id`, `role_name`) VALUES (1,'admin');

INSERT INTO `user`(`id`, `user_email`, `name`, `number`, `password`, `role_id`) VALUES ('[value-1]','[value-2]','[value-3]','[value-4]','[value-5]','[value-6]','[value-7]');

INSERT INTO `address`(`id`, `city`, `country`, `pincode`, `state`, `user_id`) VALUES (1,'bmcity','india','471311','MP',1);