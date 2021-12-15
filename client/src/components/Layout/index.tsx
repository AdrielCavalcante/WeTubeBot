import React from "react";

import Navbar from "../Navbar";
import Container from "../Main";
import Footer from "../Footer";

import { Flex } from "./styles";

const Layout: React.FC = () => {
  return (
    <Flex>
      <Navbar />
      <Container />
      <Footer />
    </Flex>
  );
};

export default Layout;