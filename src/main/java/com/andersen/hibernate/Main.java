package com.andersen.hibernate;

import com.andersen.hibernate.entity.Role;
import com.andersen.hibernate.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {
    public static void main(String[] args) {

        SessionFactory factory = HibernateUtill.getSessionFactory();
        Session session = null;

        try {
            session = factory.getCurrentSession();
            session.beginTransaction();

            /**Add many Users in One role**/
//            Role role = new Role("users");
//            User user1 = new User("Ilsur");
//            User user2 = new User("Petr");
//            User user3 = new User("Ivan");
//
//            role.addUserToUserList(user1);
//            role.addUserToUserList(user2);
//            role.addUserToUserList(user3);
            /**Add many Roles in One User**/
//            Role role1 = new Role("Admin");
//            Role role2 = new Role("Director");
//            Role role3 = new Role("User");
//
//            User user1 = new User("UZVER");
//            user1.addUserRoleToUserRoleLit(role1);
//            user1.addUserRoleToUserRoleLit(role2);
//            user1.addUserRoleToUserRoleLit(role3);
//            session.persist(user1);
            /**Get Users by Role**/

//            Role role = session.get(Role.class,5);
//            System.out.println(role.getUserList());
            /**Get Roles by User**/

            User user = session.get(User.class, 1);
            System.out.println(user.getUserRoleList());


            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }
    }
}
